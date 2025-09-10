package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lto extends lua {
    public lto(luk lukVar, String str) {
        super(lukVar, str);
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        num.getClass();
        this.a.h(this.b, num.intValue());
    }

    @Override // defpackage.lua
    protected final /* bridge */ /* synthetic */ Object d() {
        return Integer.valueOf(this.a.a(this.b));
    }
}
