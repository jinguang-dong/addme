package androidx.media;

import android.media.AudioAttributes;
import defpackage.dhy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(dhy dhyVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) dhyVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = dhyVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, dhy dhyVar) {
        dhyVar.i(audioAttributesImplApi21.a, 1);
        dhyVar.h(audioAttributesImplApi21.b, 2);
    }
}
