package defpackage;

import android.media.AudioAttributes;
import android.speech.tts.TextToSpeech;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvz implements tzt {
    private final tzx a;

    public mvz(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final TextToSpeech a() {
        TextToSpeech textToSpeech = new TextToSpeech(((imm) this.a).b(), new TextToSpeech.OnInitListener() { // from class: mvu
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i) {
            }
        });
        textToSpeech.setAudioAttributes(new AudioAttributes.Builder().setUsage(11).setContentType(4).build());
        return textToSpeech;
    }
}
