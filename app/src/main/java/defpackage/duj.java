package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class duj extends dui {
    private final Object a;

    public duj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.dui
    public final dui a(String str, uiq uiqVar) {
        Object obj = this.a;
        return ((Boolean) uiqVar.a(obj)).booleanValue() ? this : new duh(obj, str);
    }

    @Override // defpackage.dui
    public final Object b() {
        return this.a;
    }
}
