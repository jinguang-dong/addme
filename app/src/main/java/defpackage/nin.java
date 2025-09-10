package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nin implements uiu {
    final /* synthetic */ float a;
    final /* synthetic */ nhw b;
    final /* synthetic */ boolean c;

    public nin(float f, nhw nhwVar, boolean z) {
        this.a = f;
        this.b = nhwVar;
        this.c = z;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        String str;
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            bik bikVarZ = bdq.z(bik.c, this.a);
            nhw nhwVar = this.b;
            bne bneVarD = byx.d(nhwVar.a, aycVar, 0);
            boolean z = this.c;
            if (!z || (str = nhwVar.f) == null) {
                str = nhwVar.b;
            }
            String str2 = str;
            aycVar.u(-1129382071);
            long j = z ? bay.O(aycVar).b : bkv.b;
            aycVar.n();
            avx.a(bneVarD, str2, bikVarZ, j, aycVar, 0, 0);
        }
        return ufg.a;
    }
}
