package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class duh extends dui {
    private final Object a;
    private final String b;

    public duh(Object obj, String str) {
        Collection collectionBj;
        this.a = obj;
        this.b = str;
        dul dulVar = new dul(str + " value: " + obj);
        StackTraceElement[] stackTrace = dulVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int iN = ukc.n(length + (-2), 0);
        if (iN < 0) {
            throw new IllegalArgumentException(a.bE(iN, "Requested element count ", " is less than zero."));
        }
        if (iN == 0) {
            collectionBj = ufw.a;
        } else if (iN >= length) {
            collectionBj = rnt.ap(stackTrace);
        } else if (iN == 1) {
            collectionBj = ske.bj(stackTrace[length - 1]);
        } else {
            ArrayList arrayList = new ArrayList(iN);
            for (int i = length - iN; i < length; i++) {
                arrayList.add(stackTrace[i]);
            }
            collectionBj = arrayList;
        }
        dulVar.setStackTrace((StackTraceElement[]) collectionBj.toArray(new StackTraceElement[0]));
    }

    @Override // defpackage.dui
    public final Object b() {
        return null;
    }

    @Override // defpackage.dui
    public final dui a(String str, uiq uiqVar) {
        return this;
    }
}
