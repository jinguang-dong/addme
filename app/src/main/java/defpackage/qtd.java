package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qtd {
    public final qna a;

    public qtd() {
        throw null;
    }

    static qtd a(Activity activity) {
        return new qtd(new qna(activity.getClass().getName()));
    }

    final String b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qtd) && b().equals(((qtd) obj).b());
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        return a.bw(this.a.a, "{null, ", ", true}");
    }

    public qtd(qna qnaVar) {
        this.a = qnaVar;
    }
}
