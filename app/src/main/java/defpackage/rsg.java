package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsg {
    private static final rsg c = new rsg(3, null);
    private static final rsg d = new rsg(2, null);
    public final Object a;
    public final int b;

    public rsg(int i, Object obj) {
        this.b = i;
        this.a = obj;
    }

    public static rsg a(int i) {
        return i + (-1) != 1 ? c : d;
    }
}
