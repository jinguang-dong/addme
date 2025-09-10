package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chb {
    public static final chb a = new chb(cha.b, 17, 0);
    public final float b;
    public final int c;
    public final int d;

    public chb(float f, int i, int i2) {
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chb)) {
            return false;
        }
        float f = this.b;
        chb chbVar = (chb) obj;
        float f2 = chbVar.b;
        float f3 = cha.a;
        return Float.compare(f, f2) == 0 && a.p(this.c, chbVar.c) && a.p(this.d, chbVar.d);
    }

    public final int hashCode() {
        float f = cha.a;
        return (((Float.floatToIntBits(this.b) * 31) + this.c) * 31) + this.d;
    }

    public chb(float f) {
        this(f, 0, 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = cha.a;
        float f2 = this.b;
        if (f2 == 0.0f) {
            str = "LineHeightStyle.Alignment.Top";
        } else if (f2 == cha.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f2 == cha.b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f2 == cha.c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i = this.c;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        sb.append((Object) (clFzVRcygwbq.dXk + this.d + ')'));
        sb.append(')');
        return sb.toString();
    }
}
