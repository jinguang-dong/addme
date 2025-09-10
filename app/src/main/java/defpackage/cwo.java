package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cwo {
    final cwr c;
    boolean d;
    int e = -1;
    final /* synthetic */ cwp f;

    public cwo(cwp cwpVar, cwr cwrVar) {
        this.f = cwpVar;
        this.c = cwrVar;
    }

    public boolean c(cwh cwhVar) {
        return false;
    }

    public final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        cwp cwpVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = cwpVar.d;
        cwpVar.d = i + i2;
        if (!cwpVar.e) {
            cwpVar.e = true;
            while (true) {
                try {
                    int i3 = cwpVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        cwpVar.e();
                    } else if (z3) {
                        cwpVar.f();
                    }
                    i2 = i3;
                } finally {
                    cwpVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.c(this);
        }
    }

    public abstract boolean dx();

    public void b() {
    }
}
