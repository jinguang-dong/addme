package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhw {
    public final int a;
    public final String b;
    public final uif c;
    public final cwq d;
    public final cwq e;
    public final String f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nhw(int i, String str, uif uifVar, cwq cwqVar) {
        this(i, str, uifVar, cwqVar, null);
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhw)) {
            return false;
        }
        nhw nhwVar = (nhw) obj;
        return this.a == nhwVar.a && a.ao(this.b, nhwVar.b) && a.ao(this.c, nhwVar.c) && a.ao(this.d, nhwVar.d) && a.ao(this.e, nhwVar.e) && a.ao(this.f, nhwVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        String str = this.f;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActionButtonConfig(iconResId=" + this.a + ", defaultContentDescription=" + this.b + ", onClick=" + this.c + ", isVisible=" + this.d + ", isActive=" + this.e + ", activeContentDescription=" + this.f + ")";
    }

    public nhw(int i, String str, uif uifVar, cwq cwqVar, cwq cwqVar2, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = uifVar;
        this.d = cwqVar;
        this.e = cwqVar2;
        this.f = str2;
    }

    public /* synthetic */ nhw(int i, String str, uif uifVar, cwq cwqVar, byte[] bArr) {
        this(i, str, uifVar, cwqVar, new cwq(false), null);
    }
}
