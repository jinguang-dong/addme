package defpackage;

import android.content.res.Resources;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nip implements uiu {
    final /* synthetic */ float a;
    final /* synthetic */ nhw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bbo d;

    public nip(float f, nhw nhwVar, boolean z, bbo bboVar) {
        this.a = f;
        this.b = nhwVar;
        this.c = z;
        this.d = bboVar;
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
            if (!this.c || (str = nhwVar.f) == null) {
                str = nhwVar.b;
            }
            avx.a(bneVarD, str, bikVarZ, ((bkv) this.d.a()).g, aycVar, 0, 0);
        }
        return ufg.a;
    }
}
