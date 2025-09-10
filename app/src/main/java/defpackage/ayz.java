package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayz extends ayp {
    private final bbi a;

    public ayz(bbi bbiVar, uif uifVar) {
        super(uifVar);
        this.a = bbiVar;
    }

    @Override // defpackage.ayp
    public final bag b(Object obj) {
        return new bag(this, obj, obj == null, this.a, true);
    }
}
