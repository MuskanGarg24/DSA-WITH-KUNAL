public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item){
        // this takes care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length*2];
            // copy all previous items in new data
            for (int i = 0; i < temp.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}