package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class alh extends ali {
    private final bid a;

    public alh(bid bidVar) {
        this.a = bidVar;
    }

    @Override // defpackage.ali
    public final int a(int i) {
        return this.a.a(0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alh) && a.ao(this.a, ((alh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
    }
}
