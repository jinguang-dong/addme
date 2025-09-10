package defpackage;

import java.util.Comparator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccn implements Comparator {
    private final /* synthetic */ int a;

    public ccn(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ske.aK(Integer.valueOf(((ccl) obj).b), Integer.valueOf(((ccl) obj2).b));
            case 1:
                return ske.aK(Integer.valueOf(((ccl) obj).b), Integer.valueOf(((ccl) obj2).b));
            case 2:
                uev uevVar = (uev) obj;
                uev uevVar2 = (uev) obj2;
                return (((Number) uevVar.b).intValue() - ((Number) uevVar.a).intValue()) - (((Number) uevVar2.b).intValue() - ((Number) uevVar2.a).intValue());
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                zd zdVar = cmw.a;
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length != length2) {
                    return length - length2;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                return ske.aK(Float.valueOf(((cuy) obj).a), Float.valueOf(((cuy) obj2).a));
            case 5:
                return Integer.compare(((czt) obj).c, ((czt) obj2).c);
            case 6:
                return ske.aK((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return ske.aK((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 8:
                return ske.aK(((dek) obj).a, ((dek) obj2).a);
            case 9:
                return ske.aK(((dem) obj).a, ((dem) obj2).a);
            case 10:
                return ske.aK(new cht(((dsb) obj).a), new cht(((dsb) obj2).a));
            case 11:
                return ske.aK(Float.valueOf(((gyc) obj).c), Float.valueOf(((gyc) obj2).c));
            case 12:
                return ((String) ((jod) obj).b).compareTo((String) ((jod) obj2).b);
            case 13:
                muz muzVar = (muz) obj;
                muz muzVar2 = (muz) obj2;
                int i2 = hjb.z;
                int i3 = muzVar.am;
                int i4 = muzVar2.am;
                return i3 == i4 ? muzVar2.al.compareTo(muzVar.al) : Integer.compare(i4, i3);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                imj imjVar = (imj) obj;
                imj imjVar2 = (imj) obj2;
                int iT = imjVar.t();
                int iT2 = imjVar2.t();
                if (iT != 0) {
                    return iT == iT2 ? imjVar.g().compareTo(imjVar2.g()) : Integer.compare(ins.c(imjVar2.t()), ins.c(imjVar.t()));
                }
                throw null;
            case 15:
                sgv sgvVar = kai.a;
                return Float.compare(((jyl) obj2).b(), ((jyl) obj).b());
            case 16:
                sgv sgvVar2 = kai.a;
                return Long.compare(((Long) ((kag) obj).d().h()).longValue(), ((Long) ((kag) obj2).d().h()).longValue());
            case 17:
                return Float.compare(((hpz) obj2).b, ((hpz) obj).b);
            case 18:
                int i5 = pda.a;
                return ((pcz) obj2).a() - ((pcz) obj).a();
            case 19:
                return ((String) obj).compareTo((String) obj2);
            default:
                return Integer.compare(((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
    }
}
