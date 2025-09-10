package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nsc implements uiq {
    private final /* synthetic */ int a;

    public /* synthetic */ nsc(int i) {
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.a;
        if (i == 0) {
            nry nryVar = (nry) obj;
            nryVar.getClass();
            return nryVar.c;
        }
        if (i == 1) {
            return a.ab((cbn) obj);
        }
        if (i == 2) {
            nry nryVar2 = (nry) obj;
            nryVar2.getClass();
            return nryVar2.g;
        }
        if (i != 3) {
            String str = (String) obj;
            str.getClass();
            return str;
        }
        cfl cflVar = (cfl) obj;
        cflVar.getClass();
        return "'" + cflVar.a() + "' " + cflVar.c();
    }
}
