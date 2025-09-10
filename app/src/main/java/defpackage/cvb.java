package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvb extends cvc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvb(List list) {
        super(list);
        list.getClass();
    }

    @Override // defpackage.cvc
    public final /* bridge */ /* synthetic */ cvc a(cvi cviVar) {
        ugl uglVar = new ugl((byte[]) null);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uglVar.add(((cux) list.get(i)).l(cviVar));
        }
        return new cvb(ske.bi(uglVar));
    }

    public final String toString() {
        return "Edge";
    }
}
