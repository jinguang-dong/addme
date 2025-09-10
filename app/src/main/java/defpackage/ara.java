package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ara {
    public final ccm a;
    public ccm b;
    public boolean c = false;
    public aqt d = null;

    public ara(ccm ccmVar, ccm ccmVar2) {
        this.a = ccmVar;
        this.b = ccmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ara)) {
            return false;
        }
        ara araVar = (ara) obj;
        return a.ao(this.a, araVar.a) && a.ao(this.b, araVar.b) && this.c == araVar.c && a.ao(this.d, araVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int iO = a.o(this.c);
        aqt aqtVar = this.d;
        return (((iHashCode * 31) + iO) * 31) + (aqtVar == null ? 0 : aqtVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
