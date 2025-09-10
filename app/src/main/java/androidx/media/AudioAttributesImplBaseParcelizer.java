package androidx.media;

import defpackage.dhy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(dhy dhyVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = dhyVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = dhyVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = dhyVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = dhyVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, dhy dhyVar) {
        dhyVar.h(audioAttributesImplBase.a, 1);
        dhyVar.h(audioAttributesImplBase.b, 2);
        dhyVar.h(audioAttributesImplBase.c, 3);
        dhyVar.h(audioAttributesImplBase.d, 4);
    }
}
