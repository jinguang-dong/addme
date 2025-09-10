package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogs {
    public ogt a;
    public ogt b;
    public ogn c;
    public odl[] d;
    public int f;
    private final Runnable g = new iyy(7);
    public boolean e = true;

    public final gox a() {
        ojl.aq(this.a != null, "Must set register function");
        ojl.aq(this.b != null, "Must set unregister function");
        ojl.aq(this.c != null, "Must set holder");
        ojl.az(this.c.b, "Key must not be null");
        return new gox(new ogr(this, this.c, this.d, this.e, this.f), new rnu(this), this.g);
    }
}
