package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oue extends ouf {
    public oue(Integer num) {
        super("gms:feedback_client:feedback_options_max_data_size", num);
    }

    @Override // defpackage.ouf
    public final /* bridge */ /* synthetic */ Object a() throws NumberFormatException, oub {
        Object obj;
        Integer numValueOf;
        int iIntValue;
        ContentResolver contentResolver = ouf.a;
        Integer num = (Integer) this.c;
        int iIntValue2 = num.intValue();
        ouc oucVar = otu.a;
        ouc.c(contentResolver);
        String str = this.b;
        synchronized (oucVar) {
            oucVar.a(contentResolver);
            obj = oucVar.e;
            numValueOf = (Integer) ouc.e(oucVar.c, str, num);
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            String strD = oucVar.d(contentResolver, str);
            if (strD != null) {
                try {
                    int i = Integer.parseInt(strD);
                    numValueOf = Integer.valueOf(i);
                    iIntValue2 = i;
                } catch (NumberFormatException unused) {
                }
            }
            synchronized (oucVar) {
                oucVar.b(obj, oucVar.c, str, numValueOf);
            }
            iIntValue = iIntValue2;
        }
        return Integer.valueOf(iIntValue);
    }
}
