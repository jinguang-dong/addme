package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evz implements ImageDecoder.OnHeaderDecodedListener {
    private final exd a = exd.a();
    private final int b;
    private final int c;
    private final epz d;
    private final ewu e;
    private final boolean f;
    private final eqn g;

    public evz(int i, int i2, eqm eqmVar) {
        this.b = i;
        this.c = i2;
        this.d = (epz) eqmVar.b(ewx.a);
        this.e = (ewu) eqmVar.b(ewu.g);
        eql eqlVar = ewx.d;
        boolean z = false;
        if (eqmVar.b(eqlVar) != null && ((Boolean) eqmVar.b(eqlVar)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (eqn) eqmVar.b(ewx.b);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        exd exdVar = this.a;
        int width = this.b;
        int height = this.c;
        if (exdVar.b(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == epz.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new evy());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * fA), Math.round(fA * size.getHeight()));
        eqn eqnVar = this.g;
        if (eqnVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((eqnVar == eqn.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
