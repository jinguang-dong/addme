package defpackage;

import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brg extends ujq implements uiu {
    private final /* synthetic */ int r;
    public static final brg q = new brg(20);
    public static final brg p = new brg(19);
    public static final brg o = new brg(18);
    public static final brg n = new brg(17);
    public static final brg m = new brg(16);
    public static final brg l = new brg(15);
    public static final brg k = new brg(14);
    public static final brg j = new brg(13);
    public static final brg i = new brg(12);
    public static final brg h = new brg(11);
    public static final brg g = new brg(10);
    public static final brg f = new brg(9);
    public static final brg e = new brg(8);
    public static final brg d = new brg(7);
    public static final brg c = new brg(6);
    public static final brg b = new brg(1);
    public static final brg a = new brg(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brg(int i2) {
        super(2);
        this.r = i2;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return a.ag(obj, obj2);
            case 1:
                aar aarVar = (aar) obj2;
                boolean z = false;
                if (((aar) obj) == aarVar && aarVar == aar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return bqv.a(obj, obj2);
            case 3:
                return bqv.a(obj, obj2);
            case 4:
                return bqv.a(obj, obj2);
            case 5:
                return bqv.a(obj, obj2);
            case 6:
                ((Number) obj2).intValue();
                ((bvm) obj).at();
                return ufg.a;
            case 7:
                ((bvm) obj).X((bsr) obj2);
                return ufg.a;
            case 8:
                ((bvm) obj).Y((bik) obj2);
                return ufg.a;
            case 9:
                ((bvm) obj).az((bfk) obj2);
                return ufg.a;
            case 10:
                return a.ag(obj, obj2);
            case 11:
                return (biq) obj;
            case 12:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                List listBP = ske.bP(list);
                listBP.addAll(list2);
                return listBP;
            case 13:
                return (bix) obj;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return (ufg) obj;
            case 15:
                return (ufg) obj;
            case 16:
                return (ufg) obj;
            case 17:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 18:
                cbk cbkVar = (cbk) obj;
                int i2 = ((cbk) obj2).a;
                return cbkVar;
            case 19:
                return (blp) obj;
            default:
                return (String) obj;
        }
    }
}
