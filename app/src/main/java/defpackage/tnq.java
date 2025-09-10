package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tnq implements tqq {
    public static void e(Iterable iterable, List list) {
        tpx.b(iterable);
        if (iterable instanceof tqf) {
            List listA = ((tqf) iterable).a();
            tqf tqfVar = (tqf) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (tqfVar.size() - size) + " is null.";
                    int size2 = tqfVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        tqfVar.remove(size2);
                    }
                } else if (obj instanceof toj) {
                    tqfVar.b();
                } else if (obj instanceof byte[]) {
                    toj.q((byte[]) obj);
                    tqfVar.b();
                } else {
                    tqfVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof tqz) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof trb) {
                trb trbVar = (trb) list;
                int size4 = list.size() + size3;
                int length = trbVar.b.length;
                if (size4 > length) {
                    if (length == 0) {
                        trbVar.b = new Object[Math.max(size4, 10)];
                    } else {
                        while (length < size4) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        trbVar.b = Arrays.copyOf(trbVar.b, length);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    h(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                h(list, size5);
            }
            list.add(obj3);
        }
    }

    private static void h(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: a */
    public abstract tnq clone();

    protected abstract tnq b(tnr tnrVar);

    @Override // defpackage.tqq
    public final /* bridge */ /* synthetic */ tqq c(tqr tqrVar) {
        if (n().getClass().isInstance(tqrVar)) {
            return b((tnr) tqrVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.tqq
    public final /* bridge */ /* synthetic */ tqq d(byte[] bArr) {
        return g(bArr, bArr.length);
    }

    @Override // defpackage.tqq
    public /* bridge */ /* synthetic */ void f(ton tonVar, tow towVar) {
        throw null;
    }

    public tnq g(byte[] bArr, int i) {
        throw null;
    }
}
