package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jru {
    public static final sgv a = sgv.g("jru");
    public final szh b;

    public jru(Executor executor, syu syuVar, syu syuVar2, szh szhVar) {
        this.b = szhVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(syuVar);
        arrayList.add(syuVar2);
        ske.S(arrayList).c(new gdq((Object) this, (Object) syuVar, (Object) syuVar2, 17, (byte[]) null), executor);
    }
}
