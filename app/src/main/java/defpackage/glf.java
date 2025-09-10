package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glf extends owx {
    public glf(owq owqVar) {
        super(owqVar);
    }

    @Override // defpackage.owx
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return ((Boolean) obj).booleanValue() ? ksa.AMETHYST_ON : ksa.AMETHYST_OFF;
    }

    @Override // defpackage.owx
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        return Boolean.valueOf(((ksa) obj).equals(ksa.AMETHYST_ON));
    }
}
