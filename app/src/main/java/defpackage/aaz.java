package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaz {
    public static final aaz a = new aaz(new abo(null, false, 0 == true ? 1 : 0, 63));
    public final abo b;

    public aaz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aaz) && a.ao(((aaz) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        if (a.ao(this, a)) {
            return "EnterTransition.None";
        }
        abo aboVar = this.b;
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        abb abbVar = aboVar.a;
        sb.append(abbVar != null ? abbVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - null");
        return sb.toString();
    }

    public aaz(abo aboVar) {
        this.b = aboVar;
    }
}
