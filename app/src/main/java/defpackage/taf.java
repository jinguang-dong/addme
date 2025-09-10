package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taf {
    public Object a;
    public int b;
    public int c = 2;
    public int d = 1;
    public final tad e;

    public taf(tad tadVar) {
        this.e = tadVar;
    }

    public final void a() {
        int i;
        Object obj = this.a;
        int i2 = this.b;
        if (i2 > 0) {
            tad tadVar = this.e;
            taf tafVar = tadVar.e;
            if (tafVar != null) {
                tafVar.b(obj, i2 % tafVar.c);
                taf tafVar2 = tadVar.e;
                i2 /= tafVar2.c;
                i = tafVar2.d;
            } else {
                i = 0;
            }
            while (i2 > 0) {
                List list = tadVar.b;
                if (i >= list.size()) {
                    tadVar.e();
                }
                if ((i2 & 1) == 1) {
                    ((List) list.get(i)).add(obj);
                    tadVar.c++;
                }
                i2 >>= 1;
                i++;
            }
            tadVar.f();
        }
        this.b = 0;
        this.a = null;
    }

    final void b(Object obj, int i) {
        if (i > 0) {
            int i2 = this.b;
            int i3 = i2 + i;
            int i4 = this.c;
            if (i3 < i4) {
                this.b = i3;
                if (this.e.d.nextInt(i3) < i) {
                    this.a = obj;
                    return;
                }
                return;
            }
            int i5 = i4 - i2;
            if (this.e.d.nextInt(i4) < i5) {
                this.a = obj;
            }
            this.b = this.c;
            a();
            b(obj, i - i5);
        }
    }
}
