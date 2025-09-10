package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdb implements cci {
    public final int a;
    public final int b;
    public final long c;
    public final chi d;
    public final cde e;
    public final chb f;
    public final int g;
    public final int h;
    public final chj i;

    public cdb(int i, int i2, long j, chi chiVar, cde cdeVar, chb chbVar, int i3, int i4, chj chjVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = chiVar;
        this.e = cdeVar;
        this.f = chbVar;
        this.g = i3;
        this.h = i4;
        this.i = chjVar;
        if (a.q(j, cid.a) || Float.intBitsToFloat((int) (j & 4294967295L)) >= 0.0f) {
            return;
        }
        cgh.b("lineHeight can't be negative (" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')');
    }

    public final cdb a(cdb cdbVar) {
        return cdbVar == null ? this : cdc.a(this, cdbVar.a, cdbVar.b, cdbVar.c, cdbVar.d, cdbVar.e, cdbVar.f, cdbVar.g, cdbVar.h, cdbVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdb)) {
            return false;
        }
        cdb cdbVar = (cdb) obj;
        if (!a.p(this.a, cdbVar.a) || !a.p(this.b, cdbVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = cdbVar.c;
        long j3 = cid.a;
        return a.q(j, j2) && a.ao(this.d, cdbVar.d) && a.ao(this.e, cdbVar.e) && a.ao(this.f, cdbVar.f) && a.p(this.g, cdbVar.g) && a.p(this.h, cdbVar.h) && a.ao(this.i, cdbVar.i);
    }

    public final int hashCode() {
        long j = cid.a;
        chi chiVar = this.d;
        int iHashCode = chiVar != null ? chiVar.hashCode() : 0;
        int i = this.a;
        int i2 = this.b;
        long j2 = this.c;
        cde cdeVar = this.e;
        int iHashCode2 = cdeVar != null ? cdeVar.hashCode() : 0;
        int iR = (((((i * 31) + i2) * 31) + a.r(j2)) * 31) + iHashCode;
        chb chbVar = this.f;
        int iHashCode3 = ((((((((iR * 31) + iHashCode2) * 31) + (chbVar != null ? chbVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        chj chjVar = this.i;
        return iHashCode3 + (chjVar != null ? chjVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) chc.a(this.a)) + ", textDirection=" + ((Object) che.a(this.b)) + ", lineHeight=" + ((Object) cid.c(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) cgz.a(this.g)) + ", hyphens=" + ((Object) cgy.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
