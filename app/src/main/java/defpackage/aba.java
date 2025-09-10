package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aba {
    public static final aba a = new aba(new abo(null, false, 0 == true ? 1 : 0, 63));
    private static final aba c = new aba(new abo(0 == true ? 1 : 0, true, 0 == true ? 1 : 0, 47));
    public final abo b;

    public aba() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aba) && a.ao(((aba) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        if (a.ao(this, a)) {
            return "ExitTransition.None";
        }
        if (a.ao(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        abo aboVar = this.b;
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        abb abbVar = aboVar.a;
        sb.append(abbVar != null ? abbVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - null,\nKeepUntilTransitionsFinished - ");
        sb.append(aboVar.c);
        return sb.toString();
    }

    public aba(abo aboVar) {
        this.b = aboVar;
    }
}
