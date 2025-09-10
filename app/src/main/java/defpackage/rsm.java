package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rsm {
    public final int[] a;
    public final rsk b;
    public rsk c;
    public int d;
    public int e;
    public int f;

    public rsm(int[] iArr) {
        this.a = iArr;
        rsk rskVar = new rsk(-1, -1);
        this.b = rskVar;
        this.c = rskVar;
    }

    private final void d(rsk rskVar, StringBuilder sb) {
        for (rsk rskVar2 : rskVar.d.values()) {
            sb.append("  ");
            sb.append(rskVar);
            sb.append(" -> ");
            sb.append(rskVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, rskVar2.a, Math.min(iArr.length, rskVar2.b + 1))));
            sb.append("\"]\n");
            d(rskVar2, sb);
        }
    }

    final void a() {
        rsk rskVar = this.c.c;
        if (rskVar != null) {
            this.c = rskVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        rsk rskVar = (rsk) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (rskVar.b - rskVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = rskVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                rskVar = (rsk) rskVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int iMin = Math.min(length, i2);
            if (iMin - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
