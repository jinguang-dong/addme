package defpackage;

import android.content.Context;
import android.provider.MediaStore;
import com.google.android.build.data.JKx.wzgaYJqO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfx implements tzt {
    private final tzx a;

    public mfx(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ppj a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        scn scnVar;
        DateFormat dateFormat;
        Context context;
        String str7;
        String str8;
        String str9;
        ppu ppuVar;
        Context contextB = ((imm) this.a).b();
        SimpleDateFormat simpleDateFormat = ppj.a;
        ppi ppiVar = new ppi();
        ppiVar.a = "IMG_";
        ppiVar.b = "IMG_";
        ppiVar.c = "VID_";
        ppiVar.d = "_tmp.";
        ppiVar.d();
        ppiVar.b();
        ppiVar.a(4);
        ppiVar.e(false);
        ppiVar.f(false);
        ppiVar.c(sfd.a);
        SimpleDateFormat simpleDateFormat2 = ppj.a;
        simpleDateFormat2.getClass();
        ppiVar.k = simpleDateFormat2;
        ppiVar.h();
        ppiVar.o = "";
        ppiVar.i();
        ppiVar.g();
        ppiVar.r = true;
        ppiVar.t = (byte) (ppiVar.t | 24);
        ppiVar.m = contextB;
        ppiVar.a = "PXL_";
        ppiVar.b = "PXL_";
        ppiVar.c = "PXL_";
        ppiVar.d = wzgaYJqO.fcZANlDfWdBrE;
        ppiVar.d();
        ppiVar.b();
        ppiVar.a(2);
        ppiVar.c(new sfm("dng"));
        ppiVar.e(true);
        ppiVar.f(true);
        ppiVar.h();
        ppiVar.o = "media";
        ppiVar.i();
        ppiVar.g();
        Context context2 = ppiVar.m;
        if (context2 == null) {
            throw new IllegalStateException();
        }
        ppt pptVarA = ppu.a(context2);
        pptVarA.g(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        pptVarA.h(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        pptVarA.c = "_display_name";
        pptVarA.f();
        pptVarA.b();
        pptVarA.e = "relative_path";
        pptVarA.c();
        pptVarA.d(1);
        pptVarA.e(3);
        ppiVar.q = pptVarA.a();
        if (ppiVar.l == null) {
            ppiVar.l = sfc.a;
        }
        if (ppiVar.t != 63 || (str = ppiVar.a) == null || (str2 = ppiVar.b) == null || (str3 = ppiVar.c) == null || (str4 = ppiVar.d) == null || (str5 = ppiVar.e) == null || (str6 = ppiVar.f) == null || (scnVar = ppiVar.j) == null || (dateFormat = ppiVar.k) == null || (context = ppiVar.m) == null || (str7 = ppiVar.n) == null || (str8 = ppiVar.o) == null || (str9 = ppiVar.p) == null || (ppuVar = ppiVar.q) == null) {
            throw new IllegalStateException();
        }
        return new ppj(str, str2, str3, str4, str5, str6, ppiVar.g, ppiVar.h, ppiVar.i, scnVar, dateFormat, ppiVar.l, context, str7, str8, str9, ppuVar, ppiVar.r, ppiVar.s);
    }
}
