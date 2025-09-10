package defpackage;

import android.util.Range;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lia implements tzt {
    private final /* synthetic */ int a;

    public lia(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return a.O();
            case 1:
                quv quvVarD = quw.d();
                quvVarD.b(ual.a.fr().e());
                return quvVarD.a();
            case 2:
                return a.O();
            case 3:
                return a.O();
            case 4:
                Range range = lil.a;
                return a.O();
            case 5:
                Range range2 = lil.a;
                return new ovx(new pas(0, 0));
            case 6:
                Range range3 = lil.a;
                liz lizVar = new liz();
                lizVar.c(-1.0f);
                lizVar.b(0);
                lizVar.d(true);
                return new ovx(lizVar.a());
            case 7:
                Range range4 = lil.a;
                return a.O();
            case 8:
                Range range5 = lil.a;
                return a.O();
            case 9:
                return new qpt(bArr);
            case 10:
                ljp ljpVar = new ljp();
                ljpVar.d(-1);
                ljpVar.b(true);
                ljpVar.c(-1);
                return new ovx(ljpVar.a());
            case 11:
                return a.O();
            case 12:
                return new ovx(nmr.MIDDLE);
            case 13:
                Float fValueOf = Float.valueOf(0.0f);
                return new ovx(new Range(fValueOf, fValueOf));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ovx(lkk.AUTO);
            case 15:
                lkt lktVar = new lkt();
                lktVar.b(-1L);
                lktVar.c(true);
                return new ovx(lktVar.a());
            case 16:
                return a.O();
            case 17:
                return new ovx(0);
            case 18:
                return new lml();
            case 19:
                return new mwq((char[]) null);
            default:
                return new lob();
        }
    }
}
