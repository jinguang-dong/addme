package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ohd extends ogz {
    private boolean b;
    private ArrayList c;

    protected ohd(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    private final void g() {
        synchronized (this) {
            if (!this.b) {
                DataHolder dataHolder = this.a;
                ojl.ay(dataHolder);
                int i = dataHolder.h;
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String strF = f();
                    String strB = dataHolder.b(strF, 0, dataHolder.a(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int iA = dataHolder.a(i2);
                        String strB2 = dataHolder.b(strF, i2, iA);
                        if (strB2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + strF + ", at row: " + i2 + ", for window: " + iA);
                        }
                        if (!strB2.equals(strB)) {
                            this.c.add(Integer.valueOf(i2));
                            strB = strB2;
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    @Override // defpackage.ogz, defpackage.oha
    public final int b() {
        g();
        return this.c.size();
    }

    @Override // defpackage.oha
    public final Object c(int i) {
        int iIntValue;
        int iIntValue2;
        g();
        int iD = d(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                DataHolder dataHolder = this.a;
                ojl.ay(dataHolder);
                iIntValue = dataHolder.h;
                iIntValue2 = ((Integer) this.c.get(i)).intValue();
            } else {
                iIntValue = ((Integer) this.c.get(i + 1)).intValue();
                iIntValue2 = ((Integer) this.c.get(i)).intValue();
            }
            i2 = iIntValue - iIntValue2;
            if (i2 == 1) {
                int iD2 = d(i);
                DataHolder dataHolder2 = this.a;
                ojl.ay(dataHolder2);
                dataHolder2.a(iD2);
                i2 = 1;
            }
        }
        return e(iD, i2);
    }

    final int d(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(a.bE(i, "Position ", " is out of bounds for this buffer"));
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    protected abstract Object e(int i, int i2);

    protected abstract String f();
}
