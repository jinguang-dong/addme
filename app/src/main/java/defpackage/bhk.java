package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bhk extends bhj implements Iterator, ukd {
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhk(bhc bhcVar, Iterator it, int i, byte[] bArr) {
        super(bhcVar, it);
        this.e = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e != 0) {
            Map.Entry entry = this.d;
            if (entry == null) {
                throw new IllegalStateException();
            }
            a();
            return entry.getKey();
        }
        Map.Entry entry2 = this.d;
        if (entry2 == null) {
            throw new IllegalStateException();
        }
        a();
        return entry2.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhk(bhc bhcVar, Iterator it, int i) {
        super(bhcVar, it);
        this.e = i;
    }
}
