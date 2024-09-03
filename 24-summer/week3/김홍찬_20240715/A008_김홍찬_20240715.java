import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no4344();
  }

  void no4344() {
    int times;
    Students[] classRoom;
    Scanner s = new Scanner(System.in);

    times = s.nextInt();
    s.nextLine();

    String[] outputs = new String[times];
    classRoom = new Students[times];
    for (int i = 0; i < times; i++) {
      String input = s.nextLine();
      String[] inputs = input.split(" ");
      int numOfStudents = Integer.parseInt(inputs[0]); 
      int[] nums = new int[numOfStudents];
      for (int j = 1; j <= numOfStudents; j++) {
        nums[j - 1] = Integer.parseInt(inputs[j]);
      }
      classRoom[i] = new Students();
      classRoom[i].setScores(nums);
      outputs[i] = new String();
      outputs[i] = String.format("%.3f", classRoom[i].getRatioOfUpper());
    }
    for (int i = 0; i < times; i++) {
      System.out.println(outputs[i] + "%");
    }
  }
}

class Students {
  private int numOfUpper = 0;
  private int[] scores;
  private double average;

  public double getAverage() {
    return this.average;
  }

  public void setScores(int[] scores) {
    this.scores = scores;
  }

  public double getRatioOfUpper() {
    int sum = 0;

    for (int i = 0; i < this.scores.length; i++) {
      sum += this.scores[i];
    }

    this.average = (double) sum / (double) this.scores.length;

    for (int i = 0; i < this.scores.length; i++) {
      if (this.scores[i] > this.average)
        this.numOfUpper++;
    }

    double ratio = ((double) this.numOfUpper / (double) this.scores.length) * 100.0;
    return ratio;
  }
}