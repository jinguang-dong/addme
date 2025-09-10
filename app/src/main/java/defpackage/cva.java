package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cva extends cvc {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cva(List list, boolean z) {
        super(list);
        list.getClass();
        this.a = z;
    }

    @Override // defpackage.cvc
    public final cvc a(cvi cviVar) {
        ugl uglVar = new ugl((byte[]) null);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uglVar.add(((cux) list.get(i)).l(cviVar));
        }
        return new cva(ske.bi(uglVar), this.a);
    }

    public final String toString() {
        return "Corner: cubics=" + ske.ca(this.b, ", ", null, null, new axa(6), 30) + " convex=" + this.a;
    }
}
