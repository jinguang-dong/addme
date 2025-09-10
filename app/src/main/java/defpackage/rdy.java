package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdy {
    static {
        tpc tpcVarM = tvx.a.m();
        tvr tvrVar = tvr.a;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tvx tvxVar = (tvx) tpcVarM.b;
        tvrVar.getClass();
        tvxVar.c = tvrVar;
        tvxVar.b = 1;
        tpc tpcVarM2 = tvx.a.m();
        tvv tvvVar = tvv.a;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tvx tvxVar2 = (tvx) tpcVarM2.b;
        tvvVar.getClass();
        tvxVar2.c = tvvVar;
        tvxVar2.b = 2;
        tpc tpcVarM3 = tvx.a.m();
        tvw tvwVar = tvw.a;
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tvx tvxVar3 = (tvx) tpcVarM3.b;
        tvwVar.getClass();
        tvxVar3.c = tvwVar;
        tvxVar3.b = 3;
    }

    public static String a(tvy tvyVar) {
        int i;
        String strConcat;
        String str;
        int i2 = sbp.d;
        sbk sbkVar = new sbk();
        for (tvx tvxVar : tvyVar.b) {
            int i3 = tvxVar.b;
            switch (i3) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            int i4 = i - 1;
            if (i4 == 0) {
                strConcat = "compress";
            } else if (i4 == 1) {
                tvv tvvVar = i3 == 2 ? (tvv) tvxVar.c : tvv.a;
                int i5 = tvvVar.b;
                if (i5 == 1) {
                    strConcat = "encrypt(aes_gcm_key=" + b((String) tvvVar.c) + ")";
                } else if (i5 == 2) {
                    strConcat = "encrypt(aes_gcm_hkdf_key=" + b((String) tvvVar.c) + ")";
                } else {
                    strConcat = "encrypt";
                }
            } else if (i4 == 2) {
                tvw tvwVar = i3 == 3 ? (tvw) tvxVar.c : tvw.a;
                strConcat = tvwVar.b == 1 ? "integrity(sha256=" + b((String) tvwVar.c) + ")" : "integrity";
            } else if (i4 == 3) {
                tvz tvzVar = i3 == 4 ? (tvz) tvxVar.c : tvz.a;
                a.I(1 == (tvzVar.b & 1));
                strConcat = "zip(target=" + b(tvzVar.c) + ")";
            } else if (i4 == 4) {
                tvt tvtVar = i3 == 5 ? (tvt) tvxVar.c : tvt.a;
                if (tvtVar.c.size() > 0) {
                    sbk sbkVar2 = new sbk();
                    for (tvs tvsVar : tvtVar.c) {
                        a.I(1 == (tvsVar.b & 1));
                        if ((tvsVar.b & 2) != 0) {
                            sbkVar2.h(tvsVar.c + "=" + b(tvsVar.d));
                        } else {
                            sbkVar2.h(tvsVar.c);
                        }
                    }
                    str = "(" + rnt.Z(sbkVar2.g(), ",") + ")";
                } else {
                    str = "";
                }
                strConcat = String.valueOf(tvtVar.b).concat(str);
            } else {
                if (i4 != 5) {
                    throw new IllegalArgumentException("No transform specified");
                }
                strConcat = "defrag";
            }
            sbkVar.h(strConcat);
        }
        return rdc.a(sbkVar.g());
    }

    private static final String b(String str) {
        try {
            return URLEncoder.encode(str, rcz.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
