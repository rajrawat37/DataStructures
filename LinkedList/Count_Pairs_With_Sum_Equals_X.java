public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int count=0;
        HashSet<Integer> set= new HashSet<Integer>();
        Iterator<Integer> itr1= head1.iterator();
        
        while(itr1.hasNext()){
            set.add(itr1.next());
        }
        
        Iterator<Integer> itr2= head2.iterator();
        while(itr2.hasNext()){
             if(set.contains(x-itr2.next()))
                count++;
        }
        
        return count;
    }
