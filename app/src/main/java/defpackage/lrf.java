package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrf {
    public final float a;
    public final float b;
    public final float c;

    public lrf(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.d("azimuth", this.a);
        rwbVarW.d("pitch", this.b);
        rwbVarW.d("roll", this.c);
        return rwbVarW.toString();
    }
}
