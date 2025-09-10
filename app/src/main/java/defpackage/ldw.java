package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldw implements BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ldw(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                poj pojVar = (poj) obj2;
                if (pojVar != null) {
                    pojVar.close();
                    break;
                }
                break;
            case 1:
                poj pojVar2 = (poj) obj2;
                if (pojVar2 != null) {
                    pojVar2.close();
                    break;
                }
                break;
            case 2:
                ((poj) obj2).close();
                break;
            case 3:
                ((poj) obj2).close();
                break;
            case 4:
                ((mlu) obj2).c();
                break;
            case 5:
                ((scl) obj).d(obj2);
                break;
            case 6:
                ((rtl) obj).c((seo) obj2);
                break;
            case 7:
                ((sdy) obj).b(obj2);
                break;
            default:
                sdy sdyVar = (sdy) obj;
                Object obj3 = sdz.a;
                if (obj2 == null) {
                    obj2 = sdz.a;
                }
                sdyVar.b(obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
