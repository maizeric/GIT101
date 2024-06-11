package Study.dP.prototype;

import com.simba.spark.jdbc42.internal.apache.arrow.flatbuf.Int;

public class IntellijStudent extends Student {
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    public IntellijStudent clone(){
        IntellijStudent intellijStudent = new IntellijStudent();
        intellijStudent.setAvgPSP(this.getAvgPSP());
        intellijStudent.setBatchName(this.getBatchName());
        return intellijStudent;
    }
}
