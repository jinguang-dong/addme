package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckg {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public ckg(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(cjf cjfVar, int i) {
        int iO;
        int iO2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        cjn cjnVar = ((cjn) arrayList.get(0)).U;
        cjfVar.k();
        cjnVar.b(cjfVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((cjn) arrayList.get(i2)).b(cjfVar, false);
        }
        if (i == 0) {
            cjo cjoVar = (cjo) cjnVar;
            if (cjoVar.at > 0) {
                chp.v(cjoVar, cjfVar, arrayList, 0);
            }
        }
        if (i == 1) {
            cjo cjoVar2 = (cjo) cjnVar;
            if (cjoVar2.au > 0) {
                chp.v(cjoVar2, cjfVar, arrayList, 1);
            }
        }
        try {
            cjfVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new cij((cjn) arrayList.get(i3)));
        }
        if (i == 0) {
            cjo cjoVar3 = (cjo) cjnVar;
            iO = cjf.o(cjoVar3.J);
            iO2 = cjf.o(cjoVar3.L);
            cjfVar.k();
        } else {
            cjo cjoVar4 = (cjo) cjnVar;
            iO = cjf.o(cjoVar4.K);
            iO2 = cjf.o(cjoVar4.M);
            cjfVar.k();
        }
        return iO2 - iO;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                ckg ckgVar = (ckg) arrayList.get(i);
                if (this.f == ckgVar.c) {
                    c(this.d, ckgVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, ckg ckgVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cjn cjnVar = (cjn) arrayList.get(i2);
            ckgVar.d(cjnVar);
            if (i == 0) {
                cjnVar.ao = ckgVar.c;
            } else {
                cjnVar.ap = ckgVar.c;
            }
        }
        this.f = ckgVar.c;
    }

    public final boolean d(cjn cjnVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(cjnVar)) {
            return false;
        }
        arrayList.add(cjnVar);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both");
        sb.append(" [");
        sb.append(this.c);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            string = string + " " + ((cjn) arrayList.get(i2)).ai;
        }
        return string.concat(HHdu.OUoodXcIvLq);
    }
}
