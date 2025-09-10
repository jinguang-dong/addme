package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adt implements acn {
    private final int a;
    private final int b;
    private final ack c;

    public adt() {
        this(0, (ack) null, 7);
    }

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ adv a(byz byzVar) {
        return new aee(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adt)) {
            return false;
        }
        adt adtVar = (adt) obj;
        return adtVar.a == this.a && adtVar.b == this.b && a.ao(adtVar.c, this.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public adt(int i, int i2, ack ackVar) {
        this.a = i;
        this.b = i2;
        this.c = ackVar;
    }

    public /* synthetic */ adt(int i, ack ackVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? acm.a : ackVar);
    }
}
