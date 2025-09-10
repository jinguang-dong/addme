package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltj extends lua {
    public ltj(luk lukVar, String str) {
        super(lukVar, str);
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        this.a.j(this.b, bool.booleanValue());
    }

    @Override // defpackage.lua
    protected final /* bridge */ /* synthetic */ Object d() {
        return Boolean.valueOf(this.a.k(this.b));
    }
}
