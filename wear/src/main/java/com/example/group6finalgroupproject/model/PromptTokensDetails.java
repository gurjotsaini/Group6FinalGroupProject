package com.example.group6finalgroupproject.model;

/**
 * Breakdown of token usage in the prompt side.
 */
public class PromptTokensDetails {
    private int cached_tokens;
    private int audio_tokens;

    // Getters and Setters

    public int getCached_tokens() {
        return cached_tokens;
    }
    public void setCached_tokens(int cached_tokens) {
        this.cached_tokens = cached_tokens;
    }
    public int getAudio_tokens() {
        return audio_tokens;
    }
    public void setAudio_tokens(int audio_tokens) {
        this.audio_tokens = audio_tokens;
    }
}
