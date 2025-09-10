package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aym implements bht {
    private final ayj a;

    public aym(ayj ayjVar) {
        this.a = ayjVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aym) && a.ao(this.a, ((aym) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
