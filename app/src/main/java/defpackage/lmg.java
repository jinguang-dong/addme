package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmg {
    public final poj a;
    public final pao b;
    public final syu c;
    public final Rect e;
    public final ltf f;
    public final pka g;
    public final ltr i;
    public final long j;
    public final long k;
    public final ExifInterface h = null;
    public final mdm d = null;
    public final hkw l = null;

    public lmg(poj pojVar, ltf ltfVar, pka pkaVar, pao paoVar, syu syuVar, Rect rect, long j, long j2, ltr ltrVar) {
        this.a = pojVar;
        this.f = ltfVar;
        this.g = pkaVar;
        this.b = paoVar;
        this.c = syuVar;
        this.e = rect;
        this.j = j;
        this.k = j2;
        this.i = ltrVar;
    }

    public static lmf a(kiy kiyVar) {
        lmf lmfVar = new lmf(kiyVar);
        lmfVar.d = kiyVar.k();
        return lmfVar;
    }

    public static lmg b(poj pojVar, lmg lmgVar) {
        lmf lmfVar = new lmf(pojVar);
        lmfVar.a = lmgVar.g;
        lmfVar.b = lmgVar.f;
        lmfVar.c = lmgVar.b;
        lmfVar.d = lmgVar.c;
        lmfVar.g = lmgVar.i;
        lmfVar.e = lmgVar.e;
        ExifInterface exifInterface = lmgVar.h;
        mdm mdmVar = lmgVar.d;
        lmfVar.b(lmgVar.k);
        lmfVar.f = Long.valueOf(lmgVar.j);
        return lmfVar.a();
    }
}
