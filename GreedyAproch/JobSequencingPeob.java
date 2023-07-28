import java.util.*;;

public class JobSequencingPeob {
    static class Job {
        int deadline;
        int profit;
        int id;// 0(A),1(B),2(C)---- so on

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String arg[]) {
        int Jobinfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < Jobinfo.length; i++) {
            jobs.add(new Job(i, Jobinfo[i][0], Jobinfo[i][1]));
        }
        // lamda function
        // comparision functio in we define how we are going to compare two
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);// descending order of profit
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs= " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
