package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dej implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public dej(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dej dejVar = (dej) obj;
        dejVar.getClass();
        int i = this.a - dejVar.a;
        return i == 0 ? this.d - dejVar.d : i;
    }
}
