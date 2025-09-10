package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lur extends lud {
    public lur(String str, luc lucVar) {
        super(str, lucVar);
    }

    @Override // defpackage.lud
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return Boolean.valueOf(str.equals("1"));
    }

    @Override // defpackage.lud
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return true != ((Boolean) obj).booleanValue() ? "0" : "1";
    }

    public lur(String str, Boolean bool) {
        super(str, bool);
    }
}
