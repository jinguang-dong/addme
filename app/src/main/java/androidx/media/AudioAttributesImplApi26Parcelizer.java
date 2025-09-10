package androidx.media;

import android.media.AudioAttributes;
import defpackage.dhy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(dhy dhyVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) dhyVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = dhyVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, dhy dhyVar) {
        dhyVar.i(audioAttributesImplApi26.a, 1);
        dhyVar.h(audioAttributesImplApi26.b, 2);
    }
}
