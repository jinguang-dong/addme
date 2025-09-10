package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uti implements utd {
    private final long a = 0;
    private final long b = Long.MAX_VALUE;

    @Override // defpackage.utd
    public final urk a(utj utjVar) {
        uth uthVar = new uth(this, null);
        int i = use.a;
        return urn.a(new usp(new uub(uthVar, utjVar), new tg((uhb) null, 3, (short[]) null), 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uti)) {
            return false;
        }
        uti utiVar = (uti) obj;
        long j = utiVar.a;
        long j2 = utiVar.b;
        return true;
    }

    public final int hashCode() {
        return (ujk.q(0L) * 31) + ujk.q(Long.MAX_VALUE);
    }

    public final String toString() throws IOException {
        return "SharingStarted.WhileSubscribed(" + ske.ca(ske.bi(new ugl(2)), null, null, null, null, 63) + ")";
    }
}
