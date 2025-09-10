package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rof extends roj {
    private final roh a;
    private final float b;
    private final float c;

    public rof(roh rohVar, float f, float f2) {
        this.a = rohVar;
        this.b = f;
        this.c = f2;
    }

    final float a() {
        roh rohVar = this.a;
        return (float) Math.toDegrees(Math.atan((rohVar.b - this.c) / (rohVar.a - this.b)));
    }
}
